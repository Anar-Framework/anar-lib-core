
package af.gov.anar.core.infrastructure.exception.common;

public class ImageUploadException extends AbstractPlatformDomainRuleException {

    public ImageUploadException() {
        super("error.msg.image.type.upload", "Only image files of type GIF,PNG and JPG are allowed ");
    }
}
