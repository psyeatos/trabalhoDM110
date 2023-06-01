package partner.interfaces;

import java.util.List;

import trabalho.api.PartnerTO;

public interface Partner {

	public void savePartner(PartnerTO partner);
	
	public List<PartnerTO> listAll();
}
