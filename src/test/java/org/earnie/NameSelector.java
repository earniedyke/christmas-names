package org.earnie;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class NameSelector {

	@Test
	public void christmasNameSelector() throws Exception {
		KieServices ksvcs = KieServices.Factory.get();
		KieContainer kcontainer = ksvcs.getKieClasspathContainer();

		StatelessKieSession kSession = kcontainer.newStatelessKieSession();
		List<Relative> participants = new ArrayList<>();
		Relative earnie = new Relative("earnie");
		participants.add(earnie);
		Relative carol = new Relative("carol");
		participants.add(carol);
		Relative eric = new Relative("eric");
		participants.add(eric);
		Relative bonnie = new Relative("bonnie");
		participants.add(bonnie);
		Relative curtis = new Relative("curtis");
		participants.add(curtis);
		Relative ronnie = new Relative("ronnie");
		participants.add(ronnie);
		Relative jasons = new Relative("jasons");
		participants.add(jasons);
		Relative rachel = new Relative("rachel");
		participants.add(rachel);
		Relative aaron = new Relative("aaron");
		participants.add(aaron);
		Relative lydia = new Relative("lydia");
		participants.add(lydia);
		Relative steve = new Relative("steve");
		participants.add(steve);
		earnie.setSpouse(carol);
		earnie.setRandom(new Double(Math.random() * 100000).intValue());
		carol.setSpouse(earnie);
		carol.setRandom(new Double(Math.random() * 100000).intValue());
		carol.setNext(true);
		lydia.setSpouse(steve);
		lydia.setRandom(new Double(Math.random() * 100000).intValue());
		steve.setSpouse(lydia);
		steve.setRandom(new Double(Math.random() * 100000).intValue());
		bonnie.setSpouse(curtis);
		bonnie.setRandom(new Double(Math.random() * 100000).intValue());
		curtis.setSpouse(bonnie);
		curtis.setRandom(new Double(Math.random() * 100000).intValue());
		ronnie.setSpouse(jasons);
		ronnie.setRandom(new Double(Math.random() * 100000).intValue());
		jasons.setSpouse(ronnie);
		jasons.setRandom(new Double(Math.random() * 100000).intValue());
		rachel.setRandom(new Double(Math.random() * 100000).intValue());
		aaron.setRandom(new Double(Math.random() * 100000).intValue());
		aaron.setSpouse(rachel);
		rachel.setSpouse(aaron);
//		Relative jasong = new Relative("jasong");
//		jasong.setRandom(new Double(Math.random() * 100000).intValue());
//		Relative karen = new Relative("karen");
//		karen.setRandom(new Double(Math.random() * 100000).intValue());
//		jasong.setSpouse(karen);
//		karen.setSpouse(jasong);
//		participants.add(jasong);
//		participants.add(karen);
		eric.setRandom(new Double(Math.random() * 100000).intValue());
		// https://www.random.org/integers/?num=10&min=1&max=6&col=1&base=10&format=plain&rnd=new
		// URI uri = new
		// URIBuilder().setScheme("https").setHost("www.random.org")
		// .setPath("/integers")
		// .setParameter("num", String.valueOf(participants.size()))
		// .setParameter("min", "1").setParameter("max", "1000000")
		// .setParameter("col", "1").setParameter("base", "10")
		// .setParameter("format", "plain").setParameter("rnd", "new")
		// .build();
		// HttpGet get = new HttpGet(uri);
		// CloseableHttpClient client = HttpClients.createDefault();
		// CloseableHttpResponse resp = client.execute(get);
		// int x = 0;
		try {
			// System.out.println(resp.getStatusLine().getStatusCode());
			// System.out.println(resp.getEntity().getContentType());
			// BufferedReader reader = new BufferedReader(new InputStreamReader(
			// resp.getEntity().getContent()));
			// String line = reader.readLine();
			// while (line != null) {
			// System.out.println(line);
			// Relative r = participants.get(x++);
			// r.setRandom(Integer.parseInt(line));
			// line = reader.readLine();
			// }
			kSession.execute(participants);
			for (Relative r : participants) {
				System.out.println(r);
			}
		} finally {
			// resp.close();
		}
	}
}
