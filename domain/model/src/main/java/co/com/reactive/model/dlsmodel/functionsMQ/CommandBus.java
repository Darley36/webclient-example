package co.com.reactive.model.dlsmodel.functionsMQ;


import co.com.reactive.model.dlsmodel.ModelMessage;
import reactor.core.publisher.Mono;

public interface CommandBus {
    Mono<Void> retryMessage (ModelMessage modelMessage);
}
