package ma.ibi.parent.infra;

import lombok.RequiredArgsConstructor;
import ma.ibi.parent.domain.ProjectAggregate;
import ma.ibi.parent.domain.ProjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProjectProviderImpl implements ProjectProvider {

    private final ProjectRepository projectRepository;

    @Override
    public List<ProjectAggregate> getAll() {
        return projectRepository.findAll()
                .stream()
                .map(projectEntity -> new ProjectAggregate(projectEntity.getId(),projectEntity.getName(),projectEntity.getPercentage()))
                .collect(Collectors.toList());
    }
}
