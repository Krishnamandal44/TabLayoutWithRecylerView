package info.thinkandlearn.tablayoutwithrecylerview;

/**
 * Created by Admin on 29-07-2017.
 */

public class OnlineShoppingPojo {
    private String id,imageUrl,title,marketPrice,discountPrice,discountRate;

    public OnlineShoppingPojo(String id, String imageUrl, String title, String marketPrice, String discountPrice, String discountRate) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.marketPrice = marketPrice;
        this.discountPrice = discountPrice;
        this.discountRate = discountRate;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }
}
