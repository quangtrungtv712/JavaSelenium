package lesson_06;

// Template | Blueprint
public class MayGatDapLienHop {
    // What to solve

    public void gatLua(String cayLua) {
        System.out.println("Dang Gat: " + cayLua);
    }
    public void xayLua(String hatLua) {
        System.out.println("Dang Xay: " + hatLua);
    }

    public static void main(String[] args) {
      MayGatDapLienHop  mayGatDapLienHop = new MayGatDapLienHop();
      // . dot notation
      mayGatDapLienHop.gatLua("Cay Lua");
      mayGatDapLienHop.xayLua("Hat Lua");

    }
}
