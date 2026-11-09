### Hướng dẫn chạy chương trình hello world

### 1. Sử dụng IntelliJ IDEA
- Mở file HelloWorld.java.
- Nhấp vào nút chạy chương trình.

Output: Hello World
### 2. Sử dụng  Terminal
- mvn clean compile
- java -cp target/classes com.javalearning.stage01.HelloWorld

Output: Hello World

### Hướng dẫn chạy chương trình tính xếp loại

- Mở file GradeCalculator.java rồi nhấp vào nút chạy chương trình.
- Hoặc dùng Terminal:
- mvn clean compile
- java -cp target/classes org.example.stage01.GradeCalculator

Output:

Nhập điểm số (0-100): 85

Điểm số hợp lệ: 85.0 - Xếp loại: B

### Thang điểm đánh giá

| Điểm | Xếp loại |
|---|---|
| 90 - 100 | A |
| 80 - dưới 90 | B |
| 70 - dưới 80 | C |
| 60 - dưới 70 | D |
| 0 - dưới 60 | F |

