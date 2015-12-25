# MVC_JSP_Program
Everyone should be able to use simple HTML forms and write simple servlets. And deploy them in Tomcat. A good starting place, as always, is to modify example projects I have provided. Then try creating your own Eclipse projects.

1. Create a new Dynamic Web Project in Eclipse EE for your final project. This can be done
by using New -> Dynamic Web Project. This creates a project that has the “look” of the
sample projects I have posted with a WebContent folder where you can place your .html files
(remember anything put in the WEB-INF folder is private so don’t put your .html files there)
2. Think about an HTML form that you will need for your project. Write a .html file for that
form. When submitted, a servlet should be called to process the form data. Try to use a few
different types of form elements. For example, radio buttons, checkboxes, text fields, text
areas.
3. Write a Java class that can be used to store the data that is retrieved from the form. For
example, a Course object might be needed to represent a new course that is being entered or a
Customer object might be needed to represent customer information that was entered.
4. Write the servlet that will process the data in the form. Store the data in a Java object from
item #2. Generate HTML that displays the data that was entered in the form (similar to what
was done in the classreg1 example that was demo’d in class). Try to use some interesting
HTML, such as bold or italic text, or change the color of some of the text. When generating
your HTML, retrieve the data from your Java object (item #2) to give you more practice
using Java objects.
5. Optional: Store the Java object into the database (you will need this code when you submit
the final project).
Hand in an exported Eclipse Project (.zip file). Include the SQL to create the database
table you are using.
