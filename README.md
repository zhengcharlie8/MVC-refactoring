# What is this project
Basic Java Implementation of a simple game to utilize MVC architecture and observer design pattern

### How to build and test (from Terminal):

1. Make sure that you have Apache Ant installed. Run each ant command in the threeinarow folder, which contains the `build.xml` build file.

2. Run `ant document` to generate the javadoc (a hypertext description) for all of the java classes. Generated hypertext description will be in the `jdoc` folder. Open the `index.html` file.

3. Run `ant compile` to compile all of the java classes. Compiled classes will be in the `bin` folder.

4. Run `ant test` to run all unit tests.

### How to run (from Terminal):

1. After building the project (i.e., running `ant`), run the following command in the threeinarow folder followed by a 1 or 2 for args:
   `java -cp bin RowGameApp (1 or 2)`
   1. Enter 1 to play TicTacToe
   2. Enter 2 to play 3 in a row game.
