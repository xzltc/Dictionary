package com.example.dictionarydemo.domain;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "word_library")
public class WordLibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_library_id")
    private Integer wordLibraryId;
    @Column(name = "word_library_name")
    private String wordLibraryName;
    @Column(name = "category")
    private String category;
    @Column(name = "description")
    private String description;
    @Column(name = "word_count")
    private Integer wordCount;
    //一对一级联User
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "created_by",referencedColumnName = "user_id")
    private User user;

    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    //一对多WordEntry
    @OneToMany(targetEntity = WordEntry.class)
    @JoinColumn(name = "fk_word_library_id", referencedColumnName = "word_library_id")
    private Set<WordEntry> wordEntries = new HashSet<>();

    public Integer getWordLibraryId() {
        return wordLibraryId;
    }

    public void setWordLibraryId(Integer wordLibraryId) {
        this.wordLibraryId = wordLibraryId;
    }

    public String getWordLibraryName() {
        return wordLibraryName;
    }

    public void setWordLibraryName(String wordLibraryName) {
        this.wordLibraryName = wordLibraryName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
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

    public Set<WordEntry> getWordEntries() {
        return wordEntries;
    }

    public void setWordEntries(Set<WordEntry> wordEntries) {
        this.wordEntries = wordEntries;
    }
}
