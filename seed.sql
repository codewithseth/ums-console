USE ums_db;

START TRANSACTION;

-- 1️⃣ Insert Category
INSERT INTO categories (name)
VALUES ('Computer Science');

-- 2️⃣ Insert Address
INSERT INTO addresses 
(unit_number, street_number, street_name, suburb, city, state, postal_code, country)
VALUES 
('10A', '25', 'King Street', 'Central', 'Sydney', 'NSW', '2000', 'Australia');

-- 3️⃣ Insert University (address_id = 1)
INSERT INTO university (name, address_id)
VALUES ('Sydney International University', 1);

-- 4️⃣ Insert Teacher (address_id = 1)
INSERT INTO teachers (first_name, last_name, dob, address_id)
VALUES ('John', 'Smith', '1980-05-15', 1);

-- 5️⃣ Insert Student (address_id = 1)
INSERT INTO students (first_name, last_name, dob, address_id)
VALUES ('Emily', 'Johnson', '2002-09-21', 1);

-- 6️⃣ Insert Subject
-- university_id = 1
-- category_id = 1
-- teacher_id = 1
INSERT INTO subjects (name, university_id, category_id, teacher_id)
VALUES ('Database Systems', 1, 1, 1);

-- 7️⃣ Insert Enrollment
-- subject_id = 1
-- student_id = 1
INSERT INTO subject_enrollments (subject_id, student_id)
VALUES (1, 1);

COMMIT;
