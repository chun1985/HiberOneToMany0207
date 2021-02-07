
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*;
import model.*;

/**
 * Servlet implementation class QuestionAnswerServlet
 */
@WebServlet("/QuestionAnswerServlet")
public class QuestionAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuestionAnswerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 但在5.4.x版本匯總，hibernate則採用如下新方式獲取：
		// 1. 組態型別安全的準服務註冊類，這是當前應用的單例物件，不作修改，所以宣告為final
		// 在configure("cfg/hibernate.cfg.xml")方法中，如果不指定資源路徑，預設在類別路徑下尋找名為hibernate.cfg.xml的檔案
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		// 2. 根據服務註冊類建立一個後設資料資源集，同時構建後設資料並生成應用一般唯一的的session工廠
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

		/**** 上面是組態準備，下面開始我們的資料庫操作 ******/
		Session session = sessionFactory.openSession();// 從對談工廠獲取一個session

		// creating transaction object
		Transaction t = session.beginTransaction();

		Question question1 = new Question();
		question1.setQname("What is Java?");
		question1.setQid(1);

		Answer ans1 = new Answer();
		ans1.setAnswername("java is a programming language");
		ans1.setPostedby("Ravi Su");
		ans1.setQuestion(question1);

		Answer ans2 = new Answer();
		ans2.setAnswername("java is a platform");
		ans2.setPostedby("Sudhir Wong");
		ans2.setQuestion(question1);

		Question question2 = new Question();
		question2.setQid(2);
		question2.setQname("What is Servlet?");

		Answer ans3 = new Answer();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedby("Jai Li");
		ans3.setQuestion(question2);
		

		Answer ans4 = new Answer();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedby("Arun");
		ans4.setQuestion(question2);
		
		Set<Answer> list1 = new HashSet<Answer>();
		list1.add(ans1);
		list1.add(ans2);

		Set<Answer> list2 = new HashSet<Answer>();
		list2.add(ans3);
		list2.add(ans4);

		question1.setAnswers(list1);
		question2.setAnswers(list2);

		session.save(question1);
		session.save(question2);

		t.commit();
		session.close();
		System.out.println("success");

		response.getWriter().append("Server: ").append("success");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
