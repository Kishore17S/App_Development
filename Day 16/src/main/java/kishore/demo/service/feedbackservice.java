package kishore.demo.service;

import kishore.demo.entity.feedback;
import kishore.demo.repository.feedbackrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class feedbackservice {

    @Autowired
    feedbackrepo fr1;

    public List<feedback> getAllfeedbackDetails()
    {
        return fr1.findAll();
    }

    public String postfeedbackDetails(feedback fm1)
    {
        fr1.save(fm1);
        return "Training Details are saved";
    }
    public String deletefeedbackDetails(@PathVariable("id") int id)
    {
        fr1.deleteById(id);
        return "Id : "+id+" is deleted";
    }

    public feedback updatefeedbackDetails(@RequestBody feedback fm1)
    {
        System.out.println("Changes updated");
        return fr1.save(fm1);
    }
}
