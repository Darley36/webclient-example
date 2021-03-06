package co.com.reactive.config;

import co.com.reactive.model.dlsmodel.ModelMessage;
import co.com.reactive.model.dlsmodel.functionsMQ.CommandBus;
import co.com.reactive.model.dlsmodel.functionsMQ.EventsGateway;
import co.com.reactive.usecase.firstmessagecontroller.FirstMessageControllerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "co.com.reactive.usecase",
//        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
//        },
//        useDefaultFilters = false)
public class UseCasesConfig {


        @Bean
        public FirstMessageControllerUseCase firstMessageControllerUseCase(EventsGateway eventsGateway, CommandBus commandBus) {
                return new FirstMessageControllerUseCase(eventsGateway,commandBus);
        }
}
