package ar.com.huallpanestor.OrderWebFluxAnnotated.repository;

import ar.com.huallpanestor.OrderWebFluxAnnotated.order.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order, String> {
}
