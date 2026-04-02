/* =========================================================
* Req6 - Equipment State Pattern
* =========================================================
*/

interface EquipmentState {
   void reserve(EquipmentForStatePattern equipment);
   void release(EquipmentForStatePattern equipment);
   void enable(EquipmentForStatePattern equipment);
   void disable(EquipmentForStatePattern equipment);
   void markMaintenance(EquipmentForStatePattern equipment);
   void finishMaintenance(EquipmentForStatePattern equipment);
   String getStateName();
}

