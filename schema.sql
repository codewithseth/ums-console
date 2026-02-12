CREATE TABLE categories(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE addresses(
    id INT NOT NULL AUTO_INCREMENT,
    unit_number INT,
    street_number INT,
    street_name VARCHAR(255),
    suburb VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    code VARCHAR(255),
    country VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE university(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
);

CREATE TABLE teachers(
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    dob DATE,
    address_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
);

CREATE TABLE students(
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    dob DATE,
    address_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
);

CREATE TABLE subjects(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    university_id INT,
    category_id INT,
    teacher_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (university_id) REFERENCES university(id),
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN kEY (teacher_id) REFERENCES teachers(id)
);

CREATE TABLE subject_enrollments(
    subject_id INT,
    student_id INT,
    PRIMARY KEY (subject_id, student_id),
    FOREIGN KEY (subject_id) REFERENCES subjects(id),
    FOREIGN key (student_id) REFERENCES students(id)
);