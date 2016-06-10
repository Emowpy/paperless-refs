package io.brainkaster.paperless;

import io.brainkaster.paperless.referentiel.Facture;
import io.brainkaster.paperless.referentiel.Parapheur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class PaperlessRefsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PaperlessRefsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PaperlessRefsApplication.class);
	}

	@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

	@PostConstruct
	public void exposeIds() {
        this.repositoryRestConfiguration.exposeIdsFor(Facture.class, Parapheur.class);
	}
}
