package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    private IDao dao;

    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double temp = dao.getData();
        double result = temp * 2;
        return result;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
