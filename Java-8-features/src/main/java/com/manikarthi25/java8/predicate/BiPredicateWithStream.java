package com.manikarthi25.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateWithStream {

	public static void main(String[] args) {

		List<Domain> domains = Arrays.asList(new Domain("google.com", 1), new Domain("i-am-spammer.com", 10),
				new Domain("mkyong.com", 0), new Domain("microsoft.com", 2));

		BiPredicate<String, Integer> bi = (domain, score) -> {
			return (domain.equalsIgnoreCase("google.com") || score == 0);
		};

		// if google or score == 0
		List<Domain> result = filterBadDomain(domains, bi);
		System.out.println(result); // google.com, mkyong.com

		// if score == 0
		List<Domain> result2 = filterBadDomain(domains, (domain, score) -> score == 0);
		System.out.println(result2); // mkyong.com, microsoft.com

		// if start with i or score > 5
		List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") && score > 5);
		System.out.println(result3); // i-am-spammer.com

		// chaining with or
		List<Domain> result4 = filterBadDomain(domains, bi.or((domain, x) -> domain.equalsIgnoreCase("microsoft.com")));
		System.out.println(result4); // google.com, mkyong.com, microsoft.com

	}

	public static <T extends Domain> List<T> filterBadDomain(List<T> list, BiPredicate<String, Integer> biPredicate) {

		return list.stream().filter(x -> biPredicate.test(x.getName(), x.getScore())).collect(Collectors.toList());

	}

}

/* output

[Domain [name=google.com, score=1], Domain [name=mkyong.com, score=0]]
[Domain [name=mkyong.com, score=0]]
[Domain [name=i-am-spammer.com, score=10]]
[Domain [name=google.com, score=1], Domain [name=mkyong.com, score=0], Domain [name=microsoft.com, score=2]]

*/