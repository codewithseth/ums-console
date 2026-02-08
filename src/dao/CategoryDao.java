package dao;

import java.util.List;

import pojo.Category;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
    void add(Category category);
    void update(int id, Category category);
    void delete(int id);
}
