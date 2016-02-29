# Assignment-3-start
## Task 1
### Purpose
- Study **Inheritance** in Java

### Todo
You are going to design a area calculator for different **Shape**
- Square
- Rectangle
- Circle
- Triangle

### Expected Result
```
Area of square : xx.xxxxx
Area of rectangle : xx.xxxxx
Area of circle : xx.xxxx
Area of triangle : xx.xxx
```

### Constraints
- Please apply **Polymorphism** in your code, such as
```
Shape square = new Square(...);
Square square = new Square(...); //Don't do that
```

- Using ```System.out.println```
```
// Don't hardcode the shape type
System.out.println("Area of square : " + ...);
System.out.println("Area of rectangle : " + ...);
System.out.println("Area of circle : " + ...);
System.out.println("Area of triangle : " + ...);

// Allow
System.out.println("Area of " + square + ": " + ...);
System.out.println("Area of " + rectangle + ": " + ...);
System.out.println("Area of " + circle + ": " + ...);
System.out.println("Area of " + triangle + ": " + ...);

// OR
for loop {
    System.out.println("Area of " + shapeList[i] + ": " + ...);
}
```

## Task 2 (Release Later)
### purpose
- Study Composition in Java

### Todo
