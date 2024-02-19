package the_bloaters.large_class;

import java.awt.Frame;

public class DuplicateObservedData {
	class Interval {
		private int start;
		private int end;
		private int length;

		public Interval() {
			start = end = length = 0;
		}

		private int parseInteger(String text) {
			try {
				return Integer.parseInt(text);
			} catch (NumberFormatException ex) {
				return 0;
			}
		}

		public int getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = parseInteger(start);
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = parseInteger(end);
		}

		public int getLength() {
			return length;
		}

		public void setLength(String length) {
			this.length = parseInteger(length);
		}

		void calculateLength() {
			length = end - start;
		}

		void calculateEnd() {
			end = start + length;
		}
	}

	class IntervalWindow extends Frame {
		java.awt.TextField startField;
		java.awt.TextField endField;
		java.awt.TextField lengthField;
		private Interval interval;

		public IntervalWindow() {
			startField = new java.awt.TextField();
			endField = new java.awt.TextField();
			lengthField = new java.awt.TextField();
			SymFocus focusListener = new SymFocus();
			startField.addFocusListener(focusListener);
			endField.addFocusListener(focusListener);
			lengthField.addFocusListener(focusListener);
		}

		class SymFocus extends java.awt.event.FocusAdapter {

			public void focusLost(java.awt.event.FocusEvent event) {
				Object object = event.getSource();
				if (object == startField) {
					StartField_FocusLost(event);
				} else if (object == endField) {
					EndField_FocusLost(event);
				} else if (object == lengthField) {
					LengthField_FocusLost(event);
				}
			}

			void StartField_FocusLost(java.awt.event.FocusEvent event) {
				interval.setStart(startField.getText());
				calculateLength();
			}

			void EndField_FocusLost(java.awt.event.FocusEvent event) {
				interval.setEnd(endField.getText());
				calculateLength();
			}

			void LengthField_FocusLost(java.awt.event.FocusEvent event) {
				interval.setLength(lengthField.getText());
				calculateEnd();
			}

			void calculateLength() {
				interval.calculateLength();
				lengthField.setText(interval.getLength() + "");
			}

			void calculateEnd() {
				interval.calculateEnd();
				endField.setText(interval.getEnd() + "");
			}
		}
	}
}
