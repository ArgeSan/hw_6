public class Skeleton  extends Boss{
    private int kolichestva;

    public int getKolichestva() {
        return kolichestva;
    }

    public void setKolichestva(int kolichestva) {
        this.kolichestva = kolichestva;
    }

    @Override
    public String printInfo() {
        return super.printInfo() +" Number of arrows: "+ getKolichestva();
    }
}
