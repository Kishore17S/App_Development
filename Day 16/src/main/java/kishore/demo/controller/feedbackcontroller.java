package kishore.demo.controller;

import kishore.demo.entity.feedback;
import kishore.demo.service.feedbackservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class feedbackcontroller {

    @Autowired
    feedbackservice fs1;


    @GetMapping("/feedbackgetall")
    public ResponseEntity<List<feedback>> getAllfeedbackDetails() {
        List<feedback> feedbacks = fs1.getAllfeedbackDetails();
        return ResponseEntity.ok(feedbacks);
    }

    @PostMapping("/feedbackpost")
    public ResponseEntity<String> postfeedbackDetails(@RequestBody feedback fm1) {
        fs1.postfeedbackDetails(fm1);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/feedbackdelete/{id}")
    public ResponseEntity<String> deletefeedbackDetails(@PathVariable("id") int id) {
        try {
            fs1.deletefeedbackDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/feedbackput/{id}")
    public feedback updatefeedbackDetails(@RequestBody feedback fm1)
    {
        return fs1.updatefeedbackDetails(fm1);
    }

}
