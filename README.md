# Library Management System

Here is the problem description for each Deliverable

## Deliverable 1

YorkU Library Management Java App

The “system-to-be”:

YorkU Library Management Team is now seeking a new system that can help them provide better online services to their clients (e.g., students, faculty members, non-faculty staff, and visitors). The system is supposed to be a GUI-based Java application. The basic requirements of the system (from an interview with their management teams) are as follows:

Requirements:

Req1: User Registration

	•	Any client should be able to register as a user of the system with a unique/valid email and strong password (i.e., a combination of uppercase letters, lowercase letters, numbers, and symbols).
	•	The system currently allows four types of clients to be registered: students, faculty members, non-faculty staff, and visitors, while it’s open for new types in the future.
	•	If a client registers as a student, a faculty member, or a non-faculty staff, their registration requires further validation from the management teams.

Req2: Item Rental and Subscription

	•	Any registered client can rent a physical item (i.e., books, magazines, CDs), open an online book, or subscribe to an online university-provided newsletter (e.g., NY Times).
	•	Each physical item has 20 copies in the library. Penalty will be applied if a book is overdue (i.e., $0.5 a day).
	•	A user can borrow up to 10 physical items and can keep an item for at most 1 month.
	•	All physical items borrowed from the library (books, magazines, CDs) count toward the total of 10 items.
	•	A user will lose their borrowing privileges if they have more than 3 items overdue. Books that are 15 days overdue will be considered lost.

Req3: User Dashboard

	•	After login, the system should show a list of hardcover books that a user is currently renting and the due date for returning the books.
	•	It should also prompt warnings about any book that is not returned yet and is approaching (less than 24 hours until the due date) or past the due date.

Req4: Newsletter Subscription

	•	The system should allow a user to subscribe and read a paid-for newsletter via its interface, such as the NY Times. This can be done by opening a frame within the system where the NY Times website can be loaded.
	•	A user can decide at any time to cancel a newsletter subscription.

Req5: Book Search and Recommendations

	•	A user can search for a book using the application. For a book a user is searching, the app should also show recommendations of similar other books (based on the text similarity of book titles).

Req6: Faculty Features

	•	If a user is a faculty member, the app can keep track of the courses the user is teaching and the textbooks the user has previously used.
	•	The app then offers notifications to the user when a new edition of the textbook is available.
	•	If a textbook is not available, the app should notify the library management team of this, so that they could consult with the user to procure the book.

Req7: Item Details and Management

	•	Each item has a unique identification number and other details including its location in the library and whether the item can be purchased, which will help with the navigation for clients.
	•	Managers of the system can add, enable (can be rented), or disable (cannot be rented) an item.

Req8: Student Course Materials

	•	If a user is a student, the textbooks of a given course the student is taking should be made available as virtual copies to the account of the user for the duration of the course. After that, the app should remove the virtual copies from the student account.

Req9: New Book Requests

	•	A user can request a new book. A request can be of two types: textbooks for course teaching and self-improvement.
	•	Depending on the type, the request will need to be prioritized by the app, and the user should be notified of the priority accordingly. Often, textbooks for course teaching will be given higher priority.

Req10: Discounted Purchases

	•	The system could also offer discounted purchases of items via its special agreements with publishers, whose books/DVDs are not normally freely available via the usual library management system.
	•	The system needs to provide payment options like debit, credit, mobile wallet, etc.

Req11: Data Storage

	•	System data are stored in a database; we will use CSV/Excel files to simulate this process.

Part I: Requirements Eliciting and Modeling (75 points)

Information from the interview might not cover all the requirements, you can make your own assumptions if necessary. Please draw the diagrams carefully and present as many details as possible. A real-world developer should be able to develop the system based on these diagrams.

Task1: Use Case Diagram (25 points)

	•	Identify the main actors in the system.
	•	Indicate the sources of your use cases (i.e., from which Requirements).
	•	Clarify how each Requirement can be achieved with the use cases you designed.
	•	Use a UML tool of your choice to draw a use case diagram based on the identified actors and use cases.

Task2: Activity Diagram (25 points)

	•	Based on the use case diagram drawn in Task1, select five use cases and for each of them draw an activity diagram accordingly.

Task3: Sequence Diagram (25 points)

	•	Based on the use case diagram drawn in Task1, select five use cases and for each of them draw a sequence diagram accordingly.

Part II: Design (25 points)

The diagrams you drew in Part I can help developers understand the basic requirements and functionalities of the ‘system-to-be’. In this part, we will further explore how to design the ‘system-to-be’.

Task4: Design (Class Diagram)

	•	Design the system via drawing a detailed class diagram.
	•	Identify all the possible interfaces, abstract classes, classes (including their attributes, methods, and relations among classes) and draw the class diagram of the ‘system-to-be’.
	•	Specify the multiplicity of relationships when applicable.
	•	Ensure the possible interfaces, abstract classes, and classes of your class diagram are connected using the most suitable relationships.
	•	In case of potential modeling ambiguity, use UML comments to clarify such ambiguities.
	•	Apply SOLID principles where possible.

## Deliverable 2

Purpose of the Second Deliverable

The purpose of this deliverable is to produce:

a) Redesign and Implementation

	•	Redesign and implement your project using at least six different design patterns.
	•	Provide a detailed decomposition of your system in the form of components and their interactions.
	•	Use a component diagram to show the architecture of your project.
	•	Justify how your systems are decomposed.

b) Java GUI-based Application

	•	Build a Java GUI-based application with all the functionalities of the project.
	•	Implement your system using at least five design patterns.
	•	You can use CSV files to simulate the database.

c) Report

	•	Include the following in your report:
	1.	Justification for choosing these six design patterns.
	2.	Updated class diagram (containing the six design patterns). You can use sub-diagrams to illustrate each of the six design patterns.
	3.	Component diagram.
	4.	Justification for component decomposition and interactions.
	5.	Justification for how each requirement can be achieved.

d) Demo Video

	•	Create a 5-minute demo video to illustrate how each requirement can be achieved (with sample data).

## Deliverable 3

Purpose of the Third Deliverable

We assume you have already finished the development of your project. In this deliverable, we will focus on the testing of your project. The purpose of this deliverable is to practice the use of different software quality assurance, software testing, and static analysis techniques to improve the quality of your project. You are expected to complete the following tasks in this deliverable:

	1.	JUnit-based Test Cases
	•	Write at least 10 different JUnit-based test cases for non-GUI Java classes.
	•	Your test cases should achieve an average code coverage (across all the classes) larger than 80% (on the non-GUI Java classes).
	2.	Auto-Test Generation with Randoop
	•	Run the auto-test generation tool Randoop on your project to generate test cases (for non-GUI Java classes).
	•	Compare the auto-generated tests to your tests regarding code quality and coverage.

This should clearly outline the purpose and tasks for the third deliverable in a structured and easy-to-read format.


