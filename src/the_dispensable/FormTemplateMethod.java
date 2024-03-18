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

		public String markdownView() {
			String output = "# " + getTitle() + "\n\n";
			output += "> " + getIntro() + "\n\n";
			output += getBody() + "\n\n";
			output += "_Written by " + getAuthor() + " on " + getDate() + "_";
			return output;
		}

		public String htmlView() {
			String output = "<h2>" + getTitle() + "</h2>" + "\n";
			output += "<blockquote>" + getIntro() + "</blockquote>" + "\n";
			output += "<p>" + getBody() + "</p>" + "\n";
			output += "<em>Written by " + getAuthor() + " on " + getDate() + "</em>";
			return output;
		}
	}

	void test() {
		var ar = new Article("Jonatan Christie's Super Series is complete",
				"Jonathan Christie's super series title is complete (VCG via Getty Images/Tai Chengzhe)",
				"Birmingham -Jonathan Christie is the 2024 All England champion . He is on the elite list of badminton players who have won super series titles at various levels.",
				"Mohammad Resha Pratama", "Monday, 18 Mar 2024 14:30 IWST"
		);
		System.out.println(ar.markdownView());
		System.out.println(ar.htmlView());
	}

	public static void main(String a[]) {
		new FormTemplateMethod().test();
	}
}
