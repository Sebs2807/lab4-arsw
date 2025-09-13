package edu.eci.arsw.blueprints.config;

import edu.eci.arsw.blueprints.filters.BlueprintsFilter;
import edu.eci.arsw.blueprints.filters.RedundancyFilter;
import edu.eci.arsw.blueprints.filters.UndersamplingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class FilterConfig {
	@Profile("redundancy")
	public BlueprintsFilter redundancyFilter() {
		return new RedundancyFilter();
	}

	@Profile("undersampling")
	public BlueprintsFilter undersamplingFilter() {
		return new UndersamplingFilter();
	}
}
