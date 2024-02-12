import java.util.List;

enum Status {
    PROCESSING,
    IN_DELIVERY,
    COMPLETED
}
public record Order(
        String id,
        List<Product> products,
        Status status
) {
}
