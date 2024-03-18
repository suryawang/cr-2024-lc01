package the_dispensable;

public class FormTemplateMethod {
	class Article {
		private String title;
		private String intro;
		private String body;
		private String author;
		private String date;

		public Article(String title, String intro, String body, String author, String date) {
			this.title = title;
			this.intro = intro;
			this.body = body;
			this.author = author;
			this.date = date;
		}

		public String getTitle() {
			return title;
		}

		public String getIntro() {
			return intro;
		}

		public String getBody() {
			return body;
		}

		public String getAuthor() {
			return author;
		}

		public String getDate() {
			return date;
		}
	}

	abstract class ArticleView {
		protected Article article;

		public ArticleView(Article article) {
			this.article = article;
		}

		abstract String title();

		abstract String intro();

		abstract String body();

		abstract String footer();

		public String view() {
			return title() + intro() + body() + footer();
		}
	}

	class ArticleHtmlView extends ArticleView {
		public ArticleHtmlView(Article article) {
			super(article);
		}

		String title() {
			return "<h2>" + article.getTitle() + "</h2>" + "\n";
		}

		String intro() {
			return "<blockquote>" + article.getIntro() + "</blockquote>" + "\n";
		}

		String body() {
			return "<p>" + article.getBody() + "</p>" + "\n";
		}

		String footer() {
			return "<em>Written by " + article.getAuthor() + " on " + article.getDate() + "</em>";
		}
	}

	class ArticleMarkdownView extends ArticleView {
		public ArticleMarkdownView(Article article) {
			super(article);
		}

		String title() {
			return "# " + article.getTitle() + "\n\n";
		}

		String intro() {
			return "> " + article.getIntro() + "\n\n";
		}

		String body() {
			return article.getBody() + "\n\n";
		}

		String footer() {
			return "_Written by " + article.getAuthor() + " on " + article.getDate() + "_";
		}
	}

	void test() {
		var ar = new Article("Jonatan Christie's Super Series is complete",
				"Jonathan Christie's super series title is complete (VCG via Getty Images/Tai Chengzhe)",
				"Birmingham -Jonathan Christie is the 2024 All England champion . He is on the elite list of badminton players who have won super series titles at various levels.",
				"Mohammad Resha Pratama", "Monday, 18 Mar 2024 14:30 IWST");
		System.out.println(new ArticleMarkdownView(ar).view());
		System.out.println(new ArticleHtmlView(ar).view());
	}

	public static void main(String a[]) {
		new FormTemplateMethod().test();
	}
}
