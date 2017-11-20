package ss.com.bannerslider.views;

/**
 * @author GoldITDev
 * @since 12/11/16
 */

public interface IAttributeChange {
    void onIndicatorSizeChange();
    void onSelectedSlideIndicatorChange();
    void onUnselectedSlideIndicatorChange();
    void onDefaultIndicatorsChange();
    void onAnimateIndicatorsChange();
    void onIntervalChange();
    void onLoopSlidesChange();
    void onDefaultBannerChange();
    void onEmptyViewChange();
    void onHideIndicatorsValueChanged();
}
