public class vidu {
    public static void main(String[] args) {
        int[] papers = {1000, 2000, 5000};
        int[] amounts = new int[3]; // Mảng chứa số lượng giấy bạc tương ứng với mỗi loại
        int count = 0; // Số lượng phương án hợp lệ
        System.out.println("Tất cả các phương án có tổng 200.000đ:");
        findAllWays(papers, amounts, 0, count);
    }

    public static void findAllWays(int[] papers, int[] amounts, int sum, int count) {
        // Nếu tổng đã đạt đến 200.000đ thì đưa ra phương án hợp lệ
        if (sum == 10000) {
            count++;
            System.out.print("Phương án " + count + ": ");
            for (int i = 0; i < 3; i++) {
                System.out.print(amounts[i] + " tờ " + papers[i] + "đ, ");
            }
            System.out.println();
            return;
        }
        // Nếu chưa đạt đến 200.000đ thì thử tất cả các loại giấy bạc và số lượng có thể để tăng tổng
        for (int i = 0; i < 3; i++) {
            if (sum + papers[i] <= 10000) {
                amounts[i]++;
                findAllWays(papers, amounts, sum + papers[i], count);
                amounts[i]--;
            }
}}}
