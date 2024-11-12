# Java Environment Setup and Hello World Program

## Prerequisites
To start with Java development, you need to:
1. Install the Java Development Kit (JDK).
2. Set up an IDE (like IntelliJ IDEA or Visual Studio Code).

## Step 1: Install Java JDK
1. Download the latest JDK from:
   - [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (Recommended)
   - [OpenJDK](https://jdk.java.net/)
2. Install the JDK following the installation instructions for your operating system.
3. Set the `JAVA_HOME` environment variable to the JDK installation path.
   - **Windows**: Open Environment Variables and add `JAVA_HOME` with the path to the JDK folder.
   - **Mac/Linux**: Add the following line to `.bashrc` or `.zshrc`:
     ```bash
     export JAVA_HOME=/path/to/your/jdk
     export PATH=$JAVA_HOME/bin:$PATH
     ```

4. Verify the installation by running:
   ```bash
   java -version

## Step 2: Set Up an IDE
**You can use any IDE**

### Option A: Visual Studio Code
1. Download [Visual Studio Code].(https://code.visualstudio.com/)
2. Open Extensions and install the **Java Extension Pack**.
3. Create a new file called `HelloWorld.java`.

### Option B: IntelliJ IDEA
1. Download [IntelliJ IDEA].(https://www.jetbrains.com/idea/download/?section=windows)
2. Open IntelliJ IDEA and create a new Java project.
3. IntelliJ will automatically create a `src` folder for your code.

## Step 3: Write the Hello World Program
In your IDE, create a new file named `HelloWorld.java` and add the following code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Step 4: Compile and Run the Program
**Using Command Line**

1. Open the Terminal and navigate to the directory containing `HelloWorld.java`.
2. Compile the program with:
   ```
   javac HelloWorld.java
   ```
   > This command generates a HelloWorld.class file if there are no errors.
3. Run the program with:
   ```
   java HelloWorl
   ```
4. You should see the following output:
   ```
   Hello, World!
   ```
