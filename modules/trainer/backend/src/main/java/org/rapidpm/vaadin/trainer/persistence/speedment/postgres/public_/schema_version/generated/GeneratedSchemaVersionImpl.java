package org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;
import org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.SchemaVersion;

/**
 * The generated base implementation of the {@link
 * org.rapidpm.vaadin.trainer.persistence.speedment.postgres.public_.schema_version.SchemaVersion}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSchemaVersionImpl implements SchemaVersion {
    
    private int installedRank;
    private String version;
    private String description;
    private String type;
    private String script;
    private Integer checksum;
    private String installedBy;
    private Timestamp installedOn;
    private int executionTime;
    private boolean success;
    
    protected GeneratedSchemaVersionImpl() {
        
    }
    
    @Override
    public int getInstalledRank() {
        return installedRank;
    }
    
    @Override
    public Optional<String> getVersion() {
        return Optional.ofNullable(version);
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public String getScript() {
        return script;
    }
    
    @Override
    public OptionalInt getChecksum() {
        return OptionalUtil.ofNullable(checksum);
    }
    
    @Override
    public String getInstalledBy() {
        return installedBy;
    }
    
    @Override
    public Timestamp getInstalledOn() {
        return installedOn;
    }
    
    @Override
    public int getExecutionTime() {
        return executionTime;
    }
    
    @Override
    public boolean getSuccess() {
        return success;
    }
    
    @Override
    public SchemaVersion setInstalledRank(int installedRank) {
        this.installedRank = installedRank;
        return this;
    }
    
    @Override
    public SchemaVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    
    @Override
    public SchemaVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public SchemaVersion setType(String type) {
        this.type = type;
        return this;
    }
    
    @Override
    public SchemaVersion setScript(String script) {
        this.script = script;
        return this;
    }
    
    @Override
    public SchemaVersion setChecksum(Integer checksum) {
        this.checksum = checksum;
        return this;
    }
    
    @Override
    public SchemaVersion setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
        return this;
    }
    
    @Override
    public SchemaVersion setInstalledOn(Timestamp installedOn) {
        this.installedOn = installedOn;
        return this;
    }
    
    @Override
    public SchemaVersion setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    
    @Override
    public SchemaVersion setSuccess(boolean success) {
        this.success = success;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("installedRank = " + Objects.toString(getInstalledRank()));
        sj.add("version = "       + Objects.toString(OptionalUtil.unwrap(getVersion())));
        sj.add("description = "   + Objects.toString(getDescription()));
        sj.add("type = "          + Objects.toString(getType()));
        sj.add("script = "        + Objects.toString(getScript()));
        sj.add("checksum = "      + Objects.toString(OptionalUtil.unwrap(getChecksum())));
        sj.add("installedBy = "   + Objects.toString(getInstalledBy()));
        sj.add("installedOn = "   + Objects.toString(getInstalledOn()));
        sj.add("executionTime = " + Objects.toString(getExecutionTime()));
        sj.add("success = "       + Objects.toString(getSuccess()));
        return "SchemaVersionImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof SchemaVersion)) { return false; }
        final SchemaVersion thatSchemaVersion = (SchemaVersion)that;
        if (this.getInstalledRank() != thatSchemaVersion.getInstalledRank()) {return false; }
        if (!Objects.equals(this.getVersion(), thatSchemaVersion.getVersion())) {return false; }
        if (!Objects.equals(this.getDescription(), thatSchemaVersion.getDescription())) {return false; }
        if (!Objects.equals(this.getType(), thatSchemaVersion.getType())) {return false; }
        if (!Objects.equals(this.getScript(), thatSchemaVersion.getScript())) {return false; }
        if (!Objects.equals(this.getChecksum(), thatSchemaVersion.getChecksum())) {return false; }
        if (!Objects.equals(this.getInstalledBy(), thatSchemaVersion.getInstalledBy())) {return false; }
        if (!Objects.equals(this.getInstalledOn(), thatSchemaVersion.getInstalledOn())) {return false; }
        if (this.getExecutionTime() != thatSchemaVersion.getExecutionTime()) {return false; }
        if (this.getSuccess() != thatSchemaVersion.getSuccess()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getInstalledRank());
        hash = 31 * hash + Objects.hashCode(getVersion());
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Objects.hashCode(getType());
        hash = 31 * hash + Objects.hashCode(getScript());
        hash = 31 * hash + Objects.hashCode(getChecksum());
        hash = 31 * hash + Objects.hashCode(getInstalledBy());
        hash = 31 * hash + Objects.hashCode(getInstalledOn());
        hash = 31 * hash + Integer.hashCode(getExecutionTime());
        hash = 31 * hash + Boolean.hashCode(getSuccess());
        return hash;
    }
}