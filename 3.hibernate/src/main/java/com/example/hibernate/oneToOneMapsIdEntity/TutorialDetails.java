package com.example.hibernate.oneToOneMapsIdEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name = "tutorial_details")
public class TutorialDetails {
  //mapsId
  @Id
  private Long id;

  @Column
  private Date createdOn;

  @Column
  private String createdBy;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  @JoinColumn(name = "tutorial_id")
  private Tutorial tutorial;

  public TutorialDetails(String createdBy) {
    this.createdOn = new Date();
    this.createdBy = createdBy;
  }

}
