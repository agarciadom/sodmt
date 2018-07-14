-- Triggers -------------------------------------------------------------------

DROP TRIGGER IF EXISTS status_updated ON maintenance_response;

CREATE OR REPLACE FUNCTION update_status_date() RETURNS trigger AS '
BEGIN
  UPDATE maintenance_response SET status_date = NOW() WHERE id = NEW.id;
  RETURN NEW;
END
' LANGUAGE plpgsql;

CREATE TRIGGER status_updated
  AFTER UPDATE OF status
  ON maintenance_response
  FOR ROW
  EXECUTE PROCEDURE update_status_date();
