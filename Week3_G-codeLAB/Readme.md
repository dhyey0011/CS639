# Hello World
### GoogleCodelab Link
 - https://developer.android.com/codelabs/android-training-hello-world?index=..%2F..%2Fandroid-training#0
### App-Overview And Introduction
- In this practical you learn how to install Android Studio, the Android development environment. You also create and run your first Android app, Hello World, on an emulator and on a physical device.
- After you successfully install Android Studio, you will create, from a template, a new project for the Hello World app. This simple app displays the string "Hello World" on the screen of the Android virtual or physical device.
- Here's what the finished app will look like:
<img src="https://user-images.githubusercontent.com/76675965/223603504-e7643865-fe35-4f1a-be5a-c32d4b3019cf.jpg" width="400" height="600">
#

# Hello Toast

### GoogleCodelab Link
 - https://developer.android.com/codelabs/android-training-layout-editor-part-a?index=..%2F..%2Fandroid-training#0
 
### App-Overview and Introduction
The user interface (UI) that appears on a screen of an Android device consists of a hierarchy of objects called views — every element of the screen is a View. The View class represents the basic building block for all UI components, and the base class for classes that provide interactive UI components such as buttons, checkboxes, and text entry fields. Commonly used View subclasses described over several lessons include:
- TextView for displaying text.
- EditText to enable the user to enter and edit text.
- Button and other clickable elements (such as RadioButton, CheckBox, and Spinner) to provide interactive behavior.
- ScrollView and RecyclerView to display scrollable items.
- ImageView for displaying images.
- ConstraintLayout and LinearLayout for containing other View elements and positioning them.
- The Java code that displays and drives the UI is contained in a class that extends Activity. An Activity is usually associated with a layout of UI views defined as an XML (eXtended Markup Language) file. This XML file is usually named after its Activity and defines the layout of View elements on the screen.
For example, the MainActivity code in the Hello World app displays a layout defined in the activity_main.xml layout file, which includes a TextView with the text "Hello World".
In more complex apps, an Activity might implement actions to respond to user taps, draw graphical content, or request data from a database or the internet. You learn more about the Activity class in another lesson.
- The HelloToast app consists of two Button elements and one TextView. When the user taps the first Button, it displays a short message (a Toast) on the screen. Tapping the second Button increases a "click" counter displayed in the TextView, which starts at zero.
- Here is how the finished application looks like.
<img src="https://user-images.githubusercontent.com/76675965/223603821-613dc6c6-7657-4694-8f09-08c4d4c5cf08.jpg" width="400" height="600">

# Scrolling Text

### GoogleCodelab Link
 - https://developer.android.com/codelabs/android-training-text-and-scrolling-views?index=..%2F..%2Fandroid-training#0
 
### App-Overview and Introduction
The TextView class is a subclass of the View class that displays text on the screen. You can control how the text appears with TextView attributes in the XML layout file. This practical shows how to work with multiple TextView elements, including one in which the user can scroll its contents vertically.
If you have more information than fits on the device's display, you can create a scrolling view so that the user can scroll vertically by swiping up or down, or horizontally by swiping right or left.
You would typically use a scrolling view for news stories, articles, or any lengthy text that doesn't completely fit on the display. You can also use a scrolling view to enable users to enter multiple lines of text, or to combine UI elements (such as a text field and a button) within a scrolling view.
The ScrollView class provides the layout for the scrolling view. ScrollView is a subclass of FrameLayout. Place only one view as a child within it—a child view contains the entire contents to scroll. This child view may itself be a ViewGroup (such as LinearLayout) containing UI elements.
Complex layouts may suffer performance issues with child views such as images. A good choice for a View within a ScrollView is a LinearLayout that is arranged in a vertical orientation, presenting items that the user can scroll through (such as TextView elements).
With a ScrollView, all of the UI elements are in memory and in the view hierarchy even if they aren't displayed on screen. This makes ScrollView ideal for scrolling pages of free-form text smoothly, because the text is already in memory. However, ScrollView can use up a lot of memory, which can affect the performance of the rest of your app.
- The Scrolling Text app demonstrates the ScrollView UI component. ScrollView is a ViewGroup that in this example contains a TextView. It shows a lengthy page of text—in this case, a music album review—that the user can scroll vertically to read by swiping up and down. A scroll bar appears in the right margin. The app shows how you can use text formatted with minimal HTML tags for setting text to bold or italic, and with new-line characters to separate paragraphs. You can also include active web links in the text.
- Here is How the finished app looks like : 
<img src="https://user-images.githubusercontent.com/76675965/223604550-59020c4d-9eb9-44f2-9684-a59be417bed7.jpg" width="400" height="600">

