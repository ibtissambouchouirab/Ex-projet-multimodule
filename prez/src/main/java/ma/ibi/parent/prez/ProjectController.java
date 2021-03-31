package ma.ibi.parent.prez;

import lombok.RequiredArgsConstructor;
import ma.ibi.parent.domain.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity getAll(){
        return ResponseEntity.ok(projectService.getAll());
    }
}
