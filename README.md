# Snake Game (Java Swing)

## **Overview**
This is a classic **Snake game** implemented in Java using **Swing** for the GUI.  
The player controls a snake that moves around the screen, eats apples to grow longer, and must avoid colliding with walls or itself. The game tracks your **score** based on apples eaten.  

**Key concepts demonstrated:**
- GUI creation with **Swing and AWT**
- Event-driven programming
- Keyboard input handling
- Game loops using `Timer`
- Collision detection
- Randomized apple placement

---

## **Files and Classes**

### **SnakeGame.java**
- **Purpose:** Entry point of the program.  
- **Functionality:** Creates an instance of `GameFrame` to start the game.
```java
public class SnakeGame {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}
