# Chapter one

## Classes
- Classes are building blocks, there are other building blocks such as interfaces, records, and enums
- All the different objects of the different classes represent the state of the program
- A reference is a variable that points to an object
- The methods (functions) and variables (fields) are members of the class
- The method name and parameter types are called the method signature.
Example
````
public int numberVisitors(int month){
    return 10;
}
````
The signature is numberVisitors (int)
- In the one file can be two or more top level structure but at the most one of them is allowed to be public besides the name must match with the filename.

### Compile and run
- To compile a program you can be in wherever place.
- If the class has a package declaration to execute a program you have to be in the same level of the package.

#### Compile to another directory
- The -d option specifies this target directory
Note: Java options are case sensitive. This means you cannot pass -D instead of -d
````
javac -d classes packagea/ClassA.java packageb/ClassB.java
````
The package structure is preserved under the requested target directory.

#### Run using classpath
````
java -cp classes chapter_1.packagea.ClassA
java -classpath classes chapter_1.packagea.ClassA
java --class-path classes chapter_1.packagea.ClassA
````
Important javac options<br />

| Options                               | Description                                       |
|---------------------------------------|---------------------------------------------------|
| -cp<br/> -classpath<br/> --class-path | Location of classes needed to compile the program |
| -d                                    | Directory in which to place generated class file  |
Important java option <br />

| Options                               | Description                                   |
|---------------------------------------|-----------------------------------------------|
| -cp<br/> -classpath<br/> --class-path | Location of classes needed to run the program |


| Options               | Description                                             |
|-----------------------|---------------------------------------------------------|
| -c<br/> --create<br/> | create a new JAR file                                   |
| -v<br/> --verbose     | Prints details when working with JAR files              |
| -f<br/> --file        | JAR filename                                            |
| -C                    | Directory containing files to be used to create the JAR |
