public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = getArea(A, B, C, D) + getArea(E, F, G, H);
        if(B > H || C < E || G < A || F > D) {
            return area;
        }
        else {
            int a = A > E ? A : E;
            int b = B > F ? B : F;
            int c = C < G ? C : G;
            int d = D < H ? D : H;
            area -= getArea(a, b, c, d);
            return area;
        }
    }
    private int getArea(int A, int B, int C, int D) {
        return (C - A) * (D - B);
    }
}