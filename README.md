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

## How to Run

### Clone the repository
```bash
git clone https://github.com/YourUsername/YourRepo.git
cd YourRepo
Compile the project
bash
Copy code
javac SnakeGame.java GameFrame.java GamePanel.java
Run the game
bash
Copy code
java SnakeGame
Note: All .java files should be in the same directory when compiling and running.
