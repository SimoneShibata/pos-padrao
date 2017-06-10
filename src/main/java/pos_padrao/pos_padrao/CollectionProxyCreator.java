package pos_padrao.pos_padrao;

import java.util.List;

public class CollectionProxyCreator {

	public static List createUnmodifiableList(List original) {
		return new ListProxy(original);
	}

}
