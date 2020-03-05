package hackernews.example.domain;

import java.util.List;

public class ProviderNews {
	
	private List<Hit> hits;

	public List<Hit> getHits() {
		return hits;
	}

	public void setHits(List<Hit> hits) {
		this.hits = hits;
	}
}
