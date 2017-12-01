package org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;
import org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.SchemaVersion;
import org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.SchemaVersionManager;

/**
 * The generated base implementation for the manager of every {@link
 * org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.SchemaVersion}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSchemaVersionManagerImpl 
extends AbstractManager<SchemaVersion> 
implements GeneratedSchemaVersionManager {
    
    private final TableIdentifier<SchemaVersion> tableIdentifier;
    
    protected GeneratedSchemaVersionManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("postgres", "public", "schema_version");
    }
    
    @Override
    public TableIdentifier<SchemaVersion> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<SchemaVersion>> fields() {
        return SchemaVersionManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<SchemaVersion>> primaryKeyFields() {
        return Stream.of(
            SchemaVersion.INSTALLED_RANK
        );
    }
}