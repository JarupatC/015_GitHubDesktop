import java.util.Scanner; 
public class help222 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int sum = 0;

        while (true) { 
            System.out.print("ป้อนตัวเลข (หรือป้อน 'X' เพื่อหยุด): "); 
            String input = scanner.nextLine(); 

            if (input.equalsIgnoreCase("X")) { break; } 

            try { 
                int number = Integer.parseInt(input); 
                sum += number; 
                // รวมค่าที่ป้อนเข้ามาในตัวแปร sum 
                } catch 
                (NumberFormatException e) { 
                    System.out.println("กรุณาป้อนตัวเลขที่ถูกต้อง หรือ 'X' เพื่อหยุด"); 
                } 
            } 
            System.out.println("ผลรวมของค่าที่ป้อนทั้งหมด: " + sum); 
            scanner.close(); 
        } 
    }
