package beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import trabalho.api.PartnerTO;
import dao.PARTNERDAO;
import entities.Partner;
import partner.interfaces.PartnerLocal;
import partner.interfaces.PartnerRemote;

@Stateless
@Remote(PartnerRemote.class)
@Local(PartnerLocal.class)
public class PartnerBean implements PartnerLocal, PartnerRemote{

	@EJB
	private PARTNERDAO dao;
	
	@Override
	public void savePartner(PartnerTO partner) {
		
		Partner par = new Partner();
		par.setPartnerCode(partner.getPartnerCode());
		par.setName(partner.getName());
		par.setPhone(partner.getPhone());
		par.setEmail(partner.getEmail());
    par.setRating(partner.getRating());
		
		dao.insert(st);
	}
	
	@Override
	public List<StateTO> listAll() {
		
		List<Partner> partnerList = dao.listAll();
		List<PartnerTO> partnerTO = new ArrayList<>();
		
		for (Partner partner : partnerList) {	
			PartnerTO par = new PartnerTO();
			par.setPartnerCode(partner.getPartnerCode());
		  par.setName(partner.getName());
		  par.setPhone(partner.getPhone());
		  par.setEmail(partner.getEmail());
      par.setRating(partner.getRating());

			listTO.add(par);
		}
		return listTO;
	}	
	
	
}
