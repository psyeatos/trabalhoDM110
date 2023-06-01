package trabalho.api;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import trabalho.api.PartnerService;
import trabalho.api.PartnerTO;
import trabalho.partner.interfaces.PartnerRemote;

@RequestScoped
public class PartnerServiceImpl implements PartnerService {

	@EJB(lookup="ejb:trabalho-dm110-ear-1.0/trabalho-dm110-ejb-1.0/PartnerBean!trabalho.partner.interfaces.PartnerRemote")
	private PartnerRemote partnerBean;
	
	@Override
	public void savePartner(PartnerTO partner) {
		partnerBean.savePartner(partner);
	}
	
	@Override
	public List<PartnerTO> listAll() {
		return partnerBean.listAll();
	}
}
