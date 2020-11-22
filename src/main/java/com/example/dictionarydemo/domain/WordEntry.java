package com.example.dictionarydemo.domain;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "word_entry")
public class WordEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_entry_id")
    private Integer wordEntryId;
    @Column(name = "word")
    private String word;
    @Column(name = "part_of_speeh")
    private String partOfSpeeh;
    @Column(name = "paraphrase")
    private String paraphrase;

    @ManyToOne(targetEntity = WordLibrary.class)
    @JoinColumn(name = "fk_word_library_id", referencedColumnName = "word_library_id")
    private WordLibrary wordLibrary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    private User user;

    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "query_statistics")
    private Integer QueryStatistics;
    @Column(name = "Approval_quantity")
    private Integer ApprovalQuantity;
    @Column(name = "opposition_quantity")
    private Integer OppositionQuantity;

    public Integer getWordEntryId() {
        return wordEntryId;
    }

    public void setWordEntryId(Integer wordEntryId) {
        this.wordEntryId = wordEntryId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPartOfSpeeh() {
        return partOfSpeeh;
    }

    public void setPartOfSpeeh(String partOfSpeeh) {
        this.partOfSpeeh = partOfSpeeh;
    }

    public String getParaphrase() {
        return paraphrase;
    }

    public void setParaphrase(String paraphrase) {
        this.paraphrase = paraphrase;
    }

    public WordLibrary getWordLibrary() {
        return wordLibrary;
    }

    public void setWordLibrary(WordLibrary wordLibrary) {
        this.wordLibrary = wordLibrary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getQueryStatistics() {
        return QueryStatistics;
    }

    public void setQueryStatistics(Integer queryStatistics) {
        QueryStatistics = queryStatistics;
    }

    public Integer getApprovalQuantity() {
        return ApprovalQuantity;
    }

    public void setApprovalQuantity(Integer approvalQuantity) {
        ApprovalQuantity = approvalQuantity;
    }

    public Integer getOppositionQuantity() {
        return OppositionQuantity;
    }

    public void setOppositionQuantity(Integer oppositionQuantity) {
        OppositionQuantity = oppositionQuantity;
    }

    @Override
    public String toString() {
        return "WordEntry{" +
                "wordEntryId=" + wordEntryId +
                ", word='" + word + '\'' +
                ", partOfSpeeh='" + partOfSpeeh + '\'' +
                ", paraphrase='" + paraphrase + '\'' +
                ", wordLibrary=" + wordLibrary +
                ", user=" + user +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", QueryStatistics=" + QueryStatistics +
                ", ApprovalQuantity=" + ApprovalQuantity +
                ", OppositionQuantity=" + OppositionQuantity +
                '}';
    }




}
