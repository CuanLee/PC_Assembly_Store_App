package assignment_6.cput.za.ac.pc_assembly_store_app.domain;

import java.io.Serializable;

/**
 * Created by Cuan on 4/3/2016.
 */
public class Computer implements Serializable{
    private Long id;
    private String code;
    private String description;
    private Motherboard motherboard;
    private boolean active;
    private Integer hddBays;
    private Integer caseFans;
    private FormFactor formFactor;

    public Computer() {
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public boolean isActive() {
        return active;
    }

    public Integer getHddBays() {
        return hddBays;
    }

    public Integer getCaseFans() {
        return caseFans;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    private Computer(Builder builder)
    {
        this.id = builder.id;
        this.code = builder.code;
        this.description = builder.description;
        this.motherboard = builder.motherboard;
        this.hddBays = builder.hddBays;
        this.caseFans = builder.caseFans;
        this.formFactor = builder.formFactor;
        this.active = builder.active;
    }

    public static class Builder{
        private Long id;
        private String code;
        private String description;
        private Motherboard motherboard;
        private boolean active;
        private Integer hddBays;
        private Integer caseFans;
        private FormFactor formFactor;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder code(String value)
        {
            this.code = value;
            return this;
        }

        public Builder description(String value)
        {
            this.description = value;
            return this;
        }

        public Builder motherboard(Motherboard value)
        {
            this.motherboard = value;
            return this;
        }

        public Builder hddBays(Integer value)
        {
            this.hddBays = value;
            return this;
        }

        public Builder caseFans(Integer value)
        {
            this.caseFans = value;
            return this;
        }

        public Builder formFactor(FormFactor value)
        {
            this.formFactor = value;
            return this;
        }

        public Builder active(boolean value)
        {
            this.active = value;
            return this;
        }

        public Builder copy(Computer value)
        {
            this.id = value.id;
            this.code = value.code;
            this.description = value.description;
            this.motherboard = value.motherboard;
            this.hddBays = value.hddBays;
            this.caseFans = value.caseFans;
            this.formFactor = value.formFactor;
            this.active = value.active;

            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
