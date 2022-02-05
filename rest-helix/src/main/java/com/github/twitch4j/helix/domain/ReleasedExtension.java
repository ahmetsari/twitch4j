package com.github.twitch4j.helix.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Setter(AccessLevel.PRIVATE)
public class ReleasedExtension {

    /**
     * Name of the individual or organization that owns the Extension.
     */
    private String authorName;

    /**
     * Whether the Extension has features that use Bits.
     */
    @Accessors(fluent = true)
    @JsonProperty("bits_enabled")
    private Boolean bitsEnabled;

    /**
     * Indicates if a user can install the Extension on their channel.
     * They may not be allowed if the Extension is currently in testing mode and the user is not on the allow list.
     */
    @Accessors(fluent = true)
    @JsonProperty("can_install")
    private Boolean canInstall;

    /**
     * Whether the Extension configuration is hosted by the EBS or the Extensions Configuration Service.
     * <p>
     * Possible values include "hosted", "none"
     */
    private String configurationLocation;

    /**
     * The description of the Extension.
     */
    private String description;

    /**
     * URL to the Extension’s Terms of Service.
     */
    private String eulaTosUrl;

    /**
     * Indicates if the Extension can communicate with the installed channel’s chat.
     */
    @JsonProperty("has_chat_support")
    @Accessors(fluent = true)
    private String hasChatSupport;

    /**
     * The default icon to be displayed in the Extensions directory.
     */
    private String iconUrl;

    /**
     * The default icon in a variety of sizes.
     * <p>
     * Common sizes include "100x100", "24x24", and "300x200"
     */
    private Map<String, String> iconUrls;

    /**
     * The autogenerated ID of the Extension.
     */
    private String id;

    /**
     * The name of the Extension.
     */
    private String name;

    /**
     * URL to the Extension’s privacy policy.
     */
    private String privacyPolicyUrl;

    /**
     * Indicates if the Extension wants to explicitly ask viewers to link their Twitch identity.
     */
    @Accessors(fluent = true)
    @JsonProperty("request_identity_link")
    private Boolean requestIdentityLink;

    /**
     * Screenshots to be shown in the Extensions marketplace.
     */
    private List<String> screenshotUrls;

    /**
     * The current state of the Extension.
     */
    private ExtensionState state;

    /**
     * Indicates if the Extension can determine a user’s subscription level on the channel the Extension is installed on.
     * <p>
     * Possible values include "optional", "none"
     */
    private String subscriptionsSupportLevel;

    /**
     * A brief description of the Extension.
     */
    private String summary;

    /**
     * The email users can use to receive Extension support.
     */
    private String supportEmail;

    /**
     * The version of the Extension.
     */
    private String version;

    /**
     * A brief description displayed on the channel to explain how the Extension works.
     */
    private String viewerSummary;

    /**
     * All configurations related to views such as: mobile, panel, video_overlay, and component.
     */
    private Views views;

    /**
     * Allow-listed configuration URLs for displaying the Extension.
     */
    private List<String> allowlistedConfigUrls;

    /**
     * Allow-listed panel URLs for displaying the Extension.
     */
    private List<String> allowlistedPanelUrls;

    @Data
    @Setter(AccessLevel.PRIVATE)
    public static class Views {
        private View mobile;
        private View panel;
        private View videoOverlay;
        private View component;
    }

    @Data
    @Setter(AccessLevel.PRIVATE)
    public static class View {
        @Accessors(fluent = true)
        @JsonProperty("can_link_external_content")
        private Boolean canLinkExternalContent;
        private String viewerUrl;
        private Integer aspectWidth;
        private Integer aspectHeight;
        private Integer aspectRatioX;
        private Integer aspectRatioY;
        private Boolean autoscale;
        private Integer height;
        private Integer scalePixels;
        private Integer targetHeight;
        private Integer size;
        private Boolean zoom;
        private Integer zoomPixels;
    }

}
