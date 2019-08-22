package chpater02;

public class GoodsApp {
	public static void main(String args[]) {
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountSold(30);
		camera.setCountStock(50);
		
		System.out.println(Goods.countOfGoods);
		
		camera.showInfo();
		System.out.println(camera.clacDiscountPrice(0.5f));
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println(Goods.countOfGoods);
		
	}
}
