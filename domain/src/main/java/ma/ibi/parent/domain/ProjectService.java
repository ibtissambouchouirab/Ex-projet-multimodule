package ma.ibi.parent.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectProvider projectProvider;

    public List<ProjectAggregate> getAll(){
        return projectProvider.getAll();
    }
}
